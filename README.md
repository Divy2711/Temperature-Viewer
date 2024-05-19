Jenkins Pipeline
A pipeline is a collection of steps/stages executed in the Continuous Integration and Continuous Deployment (CI/CD) process.
 A pipeline step consists of checkout, build, test, and deployment of your code.

A Jenkinsfile is a text file where we define our pipeline as a code. The Jenkinsfile exists within our project repository.
There are 2 types of JenkinsFile:
1. Declarative pipeline
2. Scripted Pipeline

Parts of declarative pipeline:
1. pipeline – keyword, with which every Jenkinsfile must start with.
2. agent – this means using which Jenkins environment will the entire pipeline or a particular stage will run, examples of agents can be maven, docker, etc. The agent any means, run the pipeline on any available agent.
3. stages – consists of one more stage.
4. stage – a task of our workflow.
5. steps – It is where we define what to do as part of the task.

Jenkins Multi Branch Pipeline: A multi-branch pipeline is a concept of automatically creating Jenkins pipelines based on Git branches. It can automatically discover new branches in the source control (Github) and automatically create a pipeline for that branch. When the pipeline build starts, Jenkins uses the Jenkinsfile in that branch for build stages. 

Multi-branch pipeline supports PR based branch discovery. Meaning, branches get discovered automatically in the pipeline if someone raises a PR (pull request) from a branch. If you have this configuration enabled, builds will get triggered only if a PR is raised. 

