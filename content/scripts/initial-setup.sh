#!/usr/bin/bash
if [ "$reponame" == "" ]
then
    read -p "Please enter the repository name: " reponame
fi

if [ "$username" == "" ]
then
    read -p "Please enter the your bitbucket user name: " username
fi

if [ "$password" == "" ]
then
    read -p "Please enter the your bitbucket password: " password
fi

if [ -d ~/Documents/projects ]
then
    echo "projects folder already exists"
else
    mkdir -p ~/Documents/projects
fi

cd ~/Documents/projects

if [ -d $reponame ];
then
    echo "Folder $reponame already exists";
else 
    fullRepo="https://$username:$password@bitbucket.org/$username/$reponame.git";
    git clone $fullRepo;
    if [ -d $reponame ]; then
        echo "cloning successful; downloading .gitignore";
        cd $reponame;
        curl -o .gitignore "https://raw.githubusercontent.com/okaram/IntroJava/master/content/gitignore_for_projects.txt"
        if [ -f .gitignore ]; 
        then
            echo "gitignore successfully installed";
        else
            echo "problem with .gitignore :(";
        fi
    fi
fi