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
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 1969-12-31 23:59:59 UTC)
 * on 2022-05-13 at 20:37:53 UTC 
 * Modify at your own risk.
 */

package com.uwetrottmann.seriesguide.backend.lists.model;

/**
 * Model definition for SgList.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the lists. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SgList extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime createdAt;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String listId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SgListItem> listItems;

  static {
    // hack to force ProGuard to consider SgListItem used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SgListItem.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer order;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updatedAt;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * @param createdAt createdAt or {@code null} for none
   */
  public SgList setCreatedAt(com.google.api.client.util.DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getListId() {
    return listId;
  }

  /**
   * @param listId listId or {@code null} for none
   */
  public SgList setListId(java.lang.String listId) {
    this.listId = listId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<SgListItem> getListItems() {
    return listItems;
  }

  /**
   * @param listItems listItems or {@code null} for none
   */
  public SgList setListItems(java.util.List<SgListItem> listItems) {
    this.listItems = listItems;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public SgList setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOrder() {
    return order;
  }

  /**
   * @param order order or {@code null} for none
   */
  public SgList setOrder(java.lang.Integer order) {
    this.order = order;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdatedAt() {
    return updatedAt;
  }

  /**
   * @param updatedAt updatedAt or {@code null} for none
   */
  public SgList setUpdatedAt(com.google.api.client.util.DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  @Override
  public SgList set(String fieldName, Object value) {
    return (SgList) super.set(fieldName, value);
  }

  @Override
  public SgList clone() {
    return (SgList) super.clone();
  }

}