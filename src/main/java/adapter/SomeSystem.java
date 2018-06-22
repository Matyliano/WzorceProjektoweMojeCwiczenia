package adapter;

import adapter.NotebookAdapter;

public class SomeSystem
{

	public static void main(String[] args)
	{
		NotebookAdapter notebookAdapter = new NotebookAdapter();
		notebookAdapter.createNote("Title 1", "First note");
		notebookAdapter.createNote("Title 2", "2 note");
		notebookAdapter.createNote("Title 3", "3 note");
		
		System.out.println(notebookAdapter.notesCatalog());
		System.out.println("Notatka 2: " + notebookAdapter.getNote("Title 2") + "\n");
		notebookAdapter.removeNote("Title 3");
		notebookAdapter.createNote("Tytu� nowej notatki", "Notatka z odbiorc�", "Frodo");
		System.out.println(notebookAdapter.notesCatalog());
	}

}
