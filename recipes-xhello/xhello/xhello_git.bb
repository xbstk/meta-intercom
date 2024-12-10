# Copyright (c) 2024 Bartosz Szostak
# This software is released under the MIT License.
# See the LICENSE file for more details.

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=976d522e73fc2beb42998d5fd693c819"

DEPENDS = "spdlog grpc gtk4"

SRC_URI = "git://github.com/xbrtszstk/xhello;protocol=https;branch=develop"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit meson pkgconfig
