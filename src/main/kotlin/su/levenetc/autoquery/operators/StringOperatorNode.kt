package su.levenetc.autoquery.operators

import su.levenetc.autoquery.nodes.OrNode

class StringOperatorNode : OrNode(listOf("=", "!="))