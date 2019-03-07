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

package com.google.api.services.cloudprivatecatalogproducer.v1beta1.model;

/**
 * The producer representation of a catalog which is a curated collection of solutions that can be
 * managed, controlled, and shared by cloud admins.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Private Catalog Producer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPrivatecatalogproducerV1beta1Catalog extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time when the catalog was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. The user-supplied description of the catalog. Maximum of 512 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The user-supplied descriptive name of the catalog as it appears in UIs. Maximum 256
   * characters in length.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. The resource name of the catalog, in the format `catalogs/{catalog_id}'.
   *
   * A unique identifier for the catalog, which is generated by catalog service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The parent resource name of the catalog, which can't be changed after a catalog is
   * created. It can only be an organization. Values are of the form
   * `//cloudresourcemanager.googleapis.com/organizations/`. Maximum 256 characters in length.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Output only. The time when the catalog was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The time when the catalog was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the catalog was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudPrivatecatalogproducerV1beta1Catalog setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. The user-supplied description of the catalog. Maximum of 512 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Required. The user-supplied description of the catalog. Maximum of 512 characters.
   * @param description description or {@code null} for none
   */
  public GoogleCloudPrivatecatalogproducerV1beta1Catalog setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The user-supplied descriptive name of the catalog as it appears in UIs. Maximum 256
   * characters in length.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The user-supplied descriptive name of the catalog as it appears in UIs. Maximum 256
   * characters in length.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudPrivatecatalogproducerV1beta1Catalog setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. The resource name of the catalog, in the format `catalogs/{catalog_id}'.
   *
   * A unique identifier for the catalog, which is generated by catalog service.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the catalog, in the format `catalogs/{catalog_id}'.
   *
   * A unique identifier for the catalog, which is generated by catalog service.
   * @param name name or {@code null} for none
   */
  public GoogleCloudPrivatecatalogproducerV1beta1Catalog setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The parent resource name of the catalog, which can't be changed after a catalog is
   * created. It can only be an organization. Values are of the form
   * `//cloudresourcemanager.googleapis.com/organizations/`. Maximum 256 characters in length.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Required. The parent resource name of the catalog, which can't be changed after a catalog is
   * created. It can only be an organization. Values are of the form
   * `//cloudresourcemanager.googleapis.com/organizations/`. Maximum 256 characters in length.
   * @param parent parent or {@code null} for none
   */
  public GoogleCloudPrivatecatalogproducerV1beta1Catalog setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Output only. The time when the catalog was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the catalog was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudPrivatecatalogproducerV1beta1Catalog setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudPrivatecatalogproducerV1beta1Catalog set(String fieldName, Object value) {
    return (GoogleCloudPrivatecatalogproducerV1beta1Catalog) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPrivatecatalogproducerV1beta1Catalog clone() {
    return (GoogleCloudPrivatecatalogproducerV1beta1Catalog) super.clone();
  }

}