package testfiles;

import java.io.File;

public class FolderAction {
    // create a new folder
    public static void createFolder(String folderPath) {
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdir();
            System.out.println("Folder created" + folder);
        }
    }

    // check if folder exist
    public static boolean checkFolderExist(String folderPath) {
        File folder = new File(folderPath);
        return folder.exists();

    }

    // rename  a folder
    public static void renameFolder(String oldPath, String newPath){
        File olderFolder= new File(oldPath);
        File newFolder= new File(newPath);
        if(olderFolder.exists()){
            olderFolder.renameTo(newFolder);
            System.out.println("Folder renamed to new path " + newPath);
        }

    }

    // Delete folder
    public static void deleteFolder(String folderPath){
        File folder= new File(folderPath);
        if(folder.exists()){
            // delete all the files from folder
            for(File file:folder.listFiles()){
                file.delete();
            }
            folder.delete();
            System.out.println("Folder deleted "+folderPath);
        }
    }

    public static void main(String[] args) {
        String folderPath = "src/test/textFiles";
        String newPath= "src/test/newTextFiles";
        createFolder(folderPath);
        checkFolderExist(folderPath);
        boolean folderExist=checkFolderExist(folderPath);
        System.out.println(folderExist);
        renameFolder(folderPath,newPath);

        deleteFolder(newPath);

    }
}
