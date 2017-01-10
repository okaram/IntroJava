Git, GitLab and source/version control
===

As programmers, we deal with text files all the time (that is what our source files usually are, just plain text). We are also changing things all the time, and may even have different versions of the same file at one time; to manage this, we have created *version control systems* (also called source control systems).

In this course we will be using [git](http://www.git-scm.com/) as our source/version control system. 

# Servers repositories and such

Git is a distributed version control system (each computer has its own repository), and does not necessarily have a master version; however, we usually have a central, master server; we will use [GitLab.org](https://GitLab.org/) (a free service) as our master server.

Within each server, there are users and *repositories*; a repository is a set of files stored on git. You may have more than one repository (and you probably want to get into the habit to do so for all your other classes and activities). For this class, you will create one repository and share it with me.

Git sees your repository as a stream of snapshots; it keeps track of all the history (when files were created, changed, deleted ...). 

You need to keep mental track of two repositories; you keep a local copy of your repository on your machine, and you *push* your changes to the remote repository.

# File states and operations

There are 3 states a file can be in git:
# committed - everything is good, nothing has changed
# modified - you have changed it in your folder, but git doesn't know much about it
# staged - you have added it to your staging area, you've told git about it.

You move files from committed to modified by just changing it in your computer, outside of git (in a text editor or IDE). 

You move files from modified to staged with `git add` or similar commands. 

You move files from staged to committed with `git commit` or similar commands.

You *push* your local changes to the remote repository with `git push` or simlar commands.

