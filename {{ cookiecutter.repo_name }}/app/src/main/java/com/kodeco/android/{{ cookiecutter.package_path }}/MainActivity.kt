/*
 * Copyright (c) 2023 Kodeco Inc.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 * 
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package {{ cookiecutter.full_package_namespace }}

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import {{ cookiecutter.full_package_namespace }}.theme.AppTheme

/**
 * Main Screen
 */
class MainActivity : AppCompatActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    // Switch to AppTheme for displaying the activity
    setTheme(R.style.AppTheme)

    super.onCreate(savedInstanceState)
    setContent { MainScreen() }

    // Your code
  }

  @Preview
  @Composable
  @OptIn(ExperimentalMaterial3Api::class)
  fun MainScreen() {
    AppTheme {
      Scaffold(
          topBar = { TopBar(onInfoClick = ::onInfoClick) },
          content = { padding -> MainContent(padding) },
      )
    }
  }

  @OptIn(ExperimentalMaterial3Api::class)
  @Composable
  fun TopBar(onInfoClick: () -> Unit) {
    TopAppBar(
        title = { Text(stringResource(id = R.string.app_name)) },
        actions = {
          IconButton(onClick = onInfoClick) {
            Icon(Icons.Default.Info, "")
          }
        }
    )
  }


  @Composable
  fun MainContent(padding: PaddingValues) {
    Box(modifier = Modifier.padding(padding).fillMaxSize()) {
      Text(text = "Hello World!", modifier = Modifier.align(Alignment.Center))
    }
  }

  private fun onInfoClick() {
    Toast.makeText(this, "This is an example action", Toast.LENGTH_SHORT).show()
  }
}
