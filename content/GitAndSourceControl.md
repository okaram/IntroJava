Git, Bitbucket and source/version control
===

As programmers, we deal with text files all the time (that is what our source files usually are, just plain text). We are also changing things all the time, and may even have different versions of the same file at one time; to manage this, we have created *version control systems* (also called source control systems).

In this course we will be using [git](http://www.git-scm.com/) as our source/version control system. 

# Servers repositories and such

Git is a distributed version control system (each computer has its own repository), and does not necessarily have a master version; however, we usually have a central, master server; we will use [BitBucket.org](https://bitbucket.org/) (a free service) as our master server.

Within each server, there are users and *repositories*; a repository is a set of files stored on git. You may have more than one repository (and you probably want to get into the habit to do so for all your other classes and activities). For this class, you will create one repository and share it with me.

# File states and operations

Git sees your repository as a stream of snapshots; it keeps track of all the history (when files were created, changed, deleted ...). You keep a local copy of your repository

