package sbs20.filenotes.storage;

import com.dropbox.core.v2.DbxFiles;

import java.util.Date;

public class File {
    private boolean isFolder;
    private String name;
    private String path;
    private String id;
    private String rev;
    private long size;
    private Date lastModified;
    private Object file;
    private boolean isLocal;

    public File(DbxFiles.FileMetadata dbxfile) {
        this.isFolder = false;
        this.name = dbxfile.name;
        this.path = dbxfile.pathLower;
        this.id = dbxfile.id;
        this.rev = dbxfile.rev;
        this.size = dbxfile.size;
        this.lastModified = dbxfile.serverModified;
        this.file = dbxfile;
        this.isLocal = false;
    }

    public File(java.io.File file) {
        this.isFolder = file.isDirectory();
        this.name = file.getName();
        this.path = file.getPath();
        this.id = "";
        this.rev = "";
        this.size = file.length();
        this.lastModified = new Date(file.lastModified());
        this.file = file;
        this.isLocal = true;
    }

    public boolean isFolder() {
        return isFolder;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getId() {
        return id;
    }

    public String getRev() {
        return rev;
    }

    public long getSize() {
        return size;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public Object getFile() {return this.file;}
}
