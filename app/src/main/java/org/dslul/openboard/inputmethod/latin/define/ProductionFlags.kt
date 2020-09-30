/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dslul.openboard.inputmethod.latin.define

object ProductionFlags {
    const val IS_HARDWARE_KEYBOARD_SUPPORTED = false

    /**
     * Include all suggestions from all dictionaries in
     * [org.dslul.openboard.inputmethod.latin.SuggestedWords.mRawSuggestions].
     */
    const val INCLUDE_RAW_SUGGESTIONS = false

    /**
     * When false, the metrics logging is not yet ready to be enabled.
     */
    const val IS_METRICS_LOGGING_SUPPORTED = false

    /**
     * When `false`, the split keyboard is not yet ready to be enabled.
     */
    const val IS_SPLIT_KEYBOARD_SUPPORTED = true
}