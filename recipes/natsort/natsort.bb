DESCRIPTION = "Perform 'natural order' comparisons of strings"
HOMEPAGE = "http://sourcefrog.net/projects/natsort/"

SRC_URI = "http://sourcefrog.net/projects/natsort/natsort.c"
SRC_URI += "http://sourcefrog.net/projects/natsort/strnatcmp.c"
SRC_URI += "http://sourcefrog.net/projects/natsort/strnatcmp.h"

B = "${WORKDIR}/build"
do_compile () {
	${CC} -I${SRCDIR} ${SRCDIR}/natsort.c ${SRCDIR}/strnatcmp.c -o natsort
}

do_install () {
	install -m 0755 -d ${D}${bindir}
	install -m 0755 natsort ${D}${bindir}/
}