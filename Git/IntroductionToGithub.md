# Introduction to working with GitHub
Welcome friends, and thank you for learning about github.
With github there are three phases to consider. The first phase 
is making a new repository. The second phase is cloning a repository
to a new machine. The third phase is working with the repository.

## Phase 1: Making a new repository
In this process, someone decides they need a new repository.
So they
1. Goes to github.com, logs in, and creates a new repository.
2. Follow the instructions to connect the repository to their machine.
3. Make some changes to the repository to get started.
4. Push those changes up to github.

That creates the repository.
Now many other people can clone this repository and have a connection to it.

## Phase 2: Cloning the repository to another machine
In this phase, someone else has decided they want to participate.
This can either mean viewing the code, or working with the code.
So they:
1. Find the url or internet address of the repository they want.
2. Use their own machine to 
```sh 
git clone "url or internet address"
```
and clone the repository to their machine.

Now the person with the cloned repository is ready to work with the person
who started the repository, as well as others that have cloned the repository.

## Phase 3: Working with the repository
Now that the repository has been created
and has been cloned to our local machine,
we are ready to get to work.

We begin by doing a 
```sh
git pull
```

This will pull down all the changes from online that had been pushed up.

Next, we go to work. 
We make our changes.
Then we first need to make sure
we have our 
