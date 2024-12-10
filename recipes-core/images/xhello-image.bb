# Copyright (c) 2024 Bartosz Szostak
# This software is released under the MIT License.
# See the LICENSE file for more details.

require recipes-core/images/xware-image-minimal.bb

IMAGE_FEATURES:append = " \
allow-empty-password \
empty-root-password \
allow-root-login \
"

IMAGE_INSTALL:append = " weston xhello"
