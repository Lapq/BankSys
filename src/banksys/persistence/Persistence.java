package banksys.persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import banksys.account.AbstractAccount;
import banksys.persistence.exception.AccountCreationException;
import banksys.persistence.exception.AccountDeletionException;
import banksys.persistence.exception.AccountNotFoundException;

public class Persistence implements IAccountRepository {

	private File file;
	
	public Persistence() throws IOException {
		file = new File("accounts.xml");
		
		if (!file.exists()) {
			file.createNewFile();
			XStream stream = new XStream();
			stream.toXML(new ArrayList<AbstractAccount>(), new FileOutputStream(file));
		}
	}

	@Override
	public void CreateAccount(AbstractAccount account) throws AccountCreationException {
		List<AbstractAccount> list = null;
		try {
			list = ReadFile();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		if (SearchAccount(account.getNumber(), list) == null) {
			list.add(account);
		}
		else {
			throw new AccountCreationException("Account already exists.", account.getNumber());
		}
		
		try {
			WriteToFile(list);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void DeleteAccount(String number) throws AccountDeletionException {
		List<AbstractAccount> list = null;
		try {
			list = ReadFile();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		AbstractAccount account = SearchAccount(number, list);
		if (account != null) {
			list.remove(account);
		}
		else {
			throw new AccountDeletionException("Account doesn't exist.", number);
		}
		
		try {
			WriteToFile(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public AbstractAccount RetrieveAccount(String number) throws AccountNotFoundException {
		List<AbstractAccount> list = null;
		try {
			list = ReadFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		if (!list.isEmpty()) {
			for (AbstractAccount account : list) {
				if (account.getNumber().equals(number)) {
					return account;
				}
			}
		}
		throw new AccountNotFoundException("Account not found.", number);
	}

	@Override
	public AbstractAccount[] list() {
		List<AbstractAccount> list = null;
		try {
			list = ReadFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		AbstractAccount[] array = null;
		
		if (!list.isEmpty()) {
			int i = 0;
			array = new AbstractAccount[list.size()];
			
			for (AbstractAccount account : list) {
				array[i++] = account;
			}
		}
		return array;
	}

	@Override
	public int NumberOfAccounts() {
		List<AbstractAccount> list = null;
		try {
			list = ReadFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list.size();
	}
	
	@Override
	public void UpdateAccount(AbstractAccount account) throws FileNotFoundException {
		List<AbstractAccount> list = null;
		try {
			list = ReadFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		if (!list.isEmpty()) {
			for (AbstractAccount acc : list) {
				if (acc.getNumber().equals(account.getNumber())) {
					list.set(list.indexOf(acc), account);
				}
			}
		}
		
		WriteToFile(list);
	}
	
	private List<AbstractAccount> ReadFile() throws FileNotFoundException {
		List<AbstractAccount> list = null;
		XStream stream = new XStream();
						
		list = (List<AbstractAccount>) stream.fromXML(new FileReader(file));
		
		if (list != null) {
			return list;
		}
		else {
			return new ArrayList<AbstractAccount>();
		}
	}
	
	private void WriteToFile(List<AbstractAccount> list) throws FileNotFoundException {
		XStream stream = new XStream();
		stream.toXML(list, new FileOutputStream(file));
	}
	
	private AbstractAccount SearchAccount(String number, List<AbstractAccount> list) {
		for (AbstractAccount account : list) {
			if (account.getNumber().equals(number)) {
				return account;
			}
		}
		return null;
	}
}