/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.repository.npm.internal.search.v1;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Data carrier (mapped to JSON) that contains score detail information for a particular npm search response entry.
 *
 * @since 3.7
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NpmSearchResponseScoreDetail
{
  @Nullable
  private Double quality;

  @Nullable
  private Double popularity;

  @Nullable
  private Double maintenance;

  @Nullable
  public Double getQuality() {
    return quality;
  }

  public void setQuality(@Nullable final Double quality) {
    this.quality = quality;
  }

  @Nullable
  public Double getPopularity() {
    return popularity;
  }

  public void setPopularity(@Nullable final Double popularity) {
    this.popularity = popularity;
  }

  @Nullable
  public Double getMaintenance() {
    return maintenance;
  }

  public void setMaintenance(@Nullable final Double maintenance) {
    this.maintenance = maintenance;
  }
}
