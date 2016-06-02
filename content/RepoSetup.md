Repository Setup
===

I am assuming you are on a Windows machine, and you have git-bash installed (instructions are similar for Linux and mac).

Open git-bash and execute the following steps:

# Go to documents folder
In Windows, we tend to store our files in the Documents folder; I will do the same here, so we need to go there firs. cd changes our folder.

```
cd ~/Documents
```

# create projects folder, and move to it

It's a good idea to create a folder for all your projects, even if they end up in different repos.
```
mkdir projects
cd projects
```

# clone your repo
We'll use the `git clone` command to clone our repository. I am assuming you want to use https to connect to your repository, and that you want to store the password in cleartext (if you're paranoid, you want to setup keys and use ssh, or not store the password in cleartext).

In the following command you need to replace USERNAME with your github username (notice it appears twice), and REPONAME and REPOPATH with the name and path to your repo (you should receive an email with the name of your repo). Github doesn't care about capitalization, and bash on Windows doesn't either, but Mac and Linux do. I will type all my folder names in lowercase.

```
git clone https://USERNAME:PASSWORD@bitbucket.org/REPOPATH/REPONAME.git   cs5000
```
This will create a folder named cs5000, with the contents of your repo. We then change to that folder 

```
cd cs5000
```

Just for fun, type
```
git status
```
should now look very similar to this:
```
On branch master
Your branch is up-to-date with 'origin/master'.
nothing to commit, working directory clean
```

Aftere this, continue onto Assignment 0.
