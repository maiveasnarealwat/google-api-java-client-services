/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.sheets.v4.model;

/**
 * The request for retrieving a Spreadsheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetSpreadsheetByDataFilterRequest extends com.google.api.client.json.GenericJson {

  /**
   * The DataFilters used to select which ranges to retrieve from the spreadsheet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataFilter> dataFilters;

  static {
    // hack to force ProGuard to consider DataFilter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DataFilter.class);
  }

  /**
   * True if grid data should be returned. This parameter is ignored if a field mask was set in the
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeGridData;

  /**
   * The DataFilters used to select which ranges to retrieve from the spreadsheet.
   * @return value or {@code null} for none
   */
  public java.util.List<DataFilter> getDataFilters() {
    return dataFilters;
  }

  /**
   * The DataFilters used to select which ranges to retrieve from the spreadsheet.
   * @param dataFilters dataFilters or {@code null} for none
   */
  public GetSpreadsheetByDataFilterRequest setDataFilters(java.util.List<DataFilter> dataFilters) {
    this.dataFilters = dataFilters;
    return this;
  }

  /**
   * True if grid data should be returned. This parameter is ignored if a field mask was set in the
   * request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeGridData() {
    return includeGridData;
  }

  /**
   * True if grid data should be returned. This parameter is ignored if a field mask was set in the
   * request.
   * @param includeGridData includeGridData or {@code null} for none
   */
  public GetSpreadsheetByDataFilterRequest setIncludeGridData(java.lang.Boolean includeGridData) {
    this.includeGridData = includeGridData;
    return this;
  }

  @Override
  public GetSpreadsheetByDataFilterRequest set(String fieldName, Object value) {
    return (GetSpreadsheetByDataFilterRequest) super.set(fieldName, value);
  }

  @Override
  public GetSpreadsheetByDataFilterRequest clone() {
    return (GetSpreadsheetByDataFilterRequest) super.clone();
  }

}