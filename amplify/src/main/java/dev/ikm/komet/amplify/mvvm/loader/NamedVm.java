/*
 * Copyright © 2015 Integrated Knowledge Management (support@ikm.dev)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.ikm.komet.amplify.mvvm.loader;

import dev.ikm.komet.amplify.mvvm.ViewModel;

/**
 * This represents a variable name and view model referencing an annotated view model inside a controller class.
 * @param variableName A variable named that's annotated with InjectViewModel.
 * @param viewModel A view model.
 */
public record NamedVm(String variableName, ViewModel viewModel) {
}