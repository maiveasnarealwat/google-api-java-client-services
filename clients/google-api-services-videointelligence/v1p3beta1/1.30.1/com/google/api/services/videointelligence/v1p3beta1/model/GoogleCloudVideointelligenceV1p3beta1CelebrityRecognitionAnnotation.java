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

package com.google.api.services.videointelligence.v1p3beta1.model;

/**
 * Celebrity recognition annotation per video.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * The tracks detected from the input video, including recognized celebrities and other detected
   * faces in the video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p3beta1CelebrityTrack> celebrityTracks;

  /**
   * The tracks detected from the input video, including recognized celebrities and other detected
   * faces in the video.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p3beta1CelebrityTrack> getCelebrityTracks() {
    return celebrityTracks;
  }

  /**
   * The tracks detected from the input video, including recognized celebrities and other detected
   * faces in the video.
   * @param celebrityTracks celebrityTracks or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation setCelebrityTracks(java.util.List<GoogleCloudVideointelligenceV1p3beta1CelebrityTrack> celebrityTracks) {
    this.celebrityTracks = celebrityTracks;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation clone() {
    return (GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation) super.clone();
  }

}
