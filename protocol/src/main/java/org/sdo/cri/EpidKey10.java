// Copyright 2020 Intel Corporation
// SPDX-License-Identifier: Apache 2.0

package org.sdo.cri;


class EpidKey10 extends EpidKey {

  EpidKey10(byte[] groupId) {
    super(groupId);
  }

  @Override
  public String getAlgorithm() {
    return getType().toString();
  }

  @Override
  public String getFormat() {
    return getType().toString();
  }

  KeyType getType() {
    return KeyType.EPIDV1_0;
  }
}
