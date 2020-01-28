# RW Android Tutorial App Bootstrapping Template

A [cookiecutter](https://github.com/cookiecutter/cookiecutter) :cookie: template for bootstrapping new Android Tutorial projects for raywenderlich.com!

## Usage

#### Step 1

Install cookiecutter (via homebrew on mac/linux):

```bash
brew install cookiecutter
```

#### Step 2

Assuming you have `git` installed, there are two ways you can setup/configure the RW Android Tutorial App (Choose one):

1. Directly via `cookiecutter`. 

    Simply execute the below one-liner command in your terminal.
    ```
    cookiecutter gh:raywenderlich/rw-android-cookiecutter-template
    ````
1. Via cloning this repository

    - using `https`

        ```bash
        git clone https://github.com/raywenderlich/rw-android-cookiecutter-template
        ```

    - using `ssh`
        ```bash
        git clone git@github.com:raywenderlich/rw-android-cookiecutter-template.git
        ```

    When done, run `cookiecutter` tool by passing in the template directory as an argument:

    ```bash
    cookiecutter rw-android-cookiecutter-template/
    ```
#### Step 3

Next you'll be prompted for various configuration options - see [`cookiecutter.json`](/cookiecutter.json) for the full list.

To accept the configuration option you see in brackets, simply hit Enter↵ or if you want to modify it then give it a correct value and that will be applied to the project.

The process would look something like below:
![screenshot](screenshot.png)

## License

```
Copyright (c) 2020 Razeware LLC

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
distribute, sublicense, create a derivative work, and/or sell copies of the
Software in any work that is designed, intended, or marketed for pedagogical or
instructional purposes related to programming, coding, application development,
or information technology.  Permission for such use, copying, modification,
merger, publication, distribution, sublicensing, creation of derivative works,
or sale is expressly withheld.

This project and source code may use libraries or frameworks that are
released under various Open-Source licenses. Use of those libraries and
frameworks are governed by their own individual licenses.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```
