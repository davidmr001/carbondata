/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.carbondata.core.datastorage.store.columnar;

import org.carbondata.core.datastorage.store.FileHolder;

public interface ColumnarKeyStore {
  /**
   * This method will be used to get the actual mdkeys array present in the
   * carbon store, it will read and uncomnpress the key
   *
   * @param fileHolder
   * @return mdkey
   * @noDictionaryValKeyIndexes, directkey indexes for determining the NO_DICTIONARY
   * Col inorder to process the direct surrogates data.
   */
  ColumnarKeyStoreDataHolder[] getUnCompressedKeyArray(FileHolder fileHolder, int[] blockIndex,
      boolean[] needCompressedData, int[] noDictionaryValKeyIndexes);

  /**
   * This method will be used to get the actual mdkeys array present in the
   * carbon store, it will read and uncomnpress the key
   *
   * @param fileHolder
   * @return mdkey
   */
  ColumnarKeyStoreDataHolder getUnCompressedKeyArray(FileHolder fileHolder, int blockIndex,
      boolean needCompressedData, int[] noDictionaryValKeyIndexes);

}
