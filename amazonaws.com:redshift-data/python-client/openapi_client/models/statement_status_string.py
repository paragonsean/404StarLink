# coding: utf-8

"""
    Redshift Data API Service

    <p>You can use the Amazon Redshift Data API to run queries on Amazon Redshift tables. You can run SQL statements, which are committed if the statement succeeds. </p> <p>For more information about the Amazon Redshift Data API and CLI usage examples, see <a href=\"https://docs.aws.amazon.com/redshift/latest/mgmt/data-api.html\">Using the Amazon Redshift Data API</a> in the <i>Amazon Redshift Management Guide</i>. </p>

    The version of the OpenAPI document: 2019-12-20
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class StatementStatusString(str, Enum):
    """
    StatementStatusString
    """

    """
    allowed enum values
    """
    SUBMITTED = 'SUBMITTED'
    PICKED = 'PICKED'
    STARTED = 'STARTED'
    FINISHED = 'FINISHED'
    ABORTED = 'ABORTED'
    FAILED = 'FAILED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of StatementStatusString from a JSON string"""
        return cls(json.loads(json_str))


