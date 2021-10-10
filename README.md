# .NET Core for NetBeans (Project: Goliath (WORK IN PROGRESS)
Brings .NET Core with C# support to NetBeans (Create projects, Open Projects, Syntax highlighting, etc.)

<img src="screenshots/david-vs-goliath.jpg" alt="David vs Goliath" />

<img src="screenshots/wpfAppInNetBeans.png" alt="opened wpf project in netbeans" />

## Features
* Open a Solution (.sln) created from Visual Studio
* Create a C# Project with Netbeans (Added new project type)
* Opens the project with all files
* New filetypes where added (.cs, .config)
* List of resources are available as nodes in the project view
* Basic Syntax Highlighting for .cs files
* Braces matching
* Reformat code

_Please report any bugs_

## Known Problems
* It is not possible to find a full featured grammar file for C#. So for this, I need to rethink of other implementations. Maybe OmniSharp could be an alternative or, what makes more sense is to use LSP for C#. So if anyone else has other ideas or can contribute, it will be great.

See these tickets for more information:

- https://github.com/dotnet/roslyn/issues/8379
- https://github.com/dotnet/csharplang/issues/1902

## ToDos
* Make a workable alpha version of .NETCore for NetBeans
    - Add more project templates
        - Generate Templates on demand, called via the CLI (https://docs.microsoft.com/en-gb/dotnet/core/tools/dotnet, https://docs.microsoft.com/en-gb/dotnet/core/tools/)
        - Add subprojects (C#, F#) to a solution via CLI
        - Multi Solution support (optional)
    - Add textfield to the .NET CLI Options
        - Read out CLI options to make autocompletion while typing into the textfield for searching for CLI arguments via --help (optional)
    - Add build functionality for a solution/sub-project via CLI
        - Build a project
        - Run a project
        - Debug a project (optional - maybe via LSP)
            - Adding debugging functionality (optional - maybe via LSP)
    - Add NuGet Package manager (optional - not in the first draft maybe)
        - Adding options for the package manager (Search/browse for the CLI and add it.)
    - Implement code completion via OmniSharp (maybe not in the first draft, because it is not easy, see this fork: https://github.com/ranSprd/netbeans-lsp-client-fork)
    - Add formatting