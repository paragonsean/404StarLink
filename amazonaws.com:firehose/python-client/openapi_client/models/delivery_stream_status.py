# coding: utf-8

"""
    Amazon Kinesis Firehose

    <fullname>Amazon Kinesis Data Firehose API Reference</fullname> <p>Amazon Kinesis Data Firehose is a fully managed service that delivers real-time streaming data to destinations such as Amazon Simple Storage Service (Amazon S3), Amazon OpenSearch Service, Amazon Redshift, Splunk, and various other supportd destinations.</p>

    The version of the OpenAPI document: 2015-08-04
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class DeliveryStreamStatus(str, Enum):
    """
    DeliveryStreamStatus
    """

    """
    allowed enum values
    """
    CREATING = 'CREATING'
    CREATING_FAILED = 'CREATING_FAILED'
    DELETING = 'DELETING'
    DELETING_FAILED = 'DELETING_FAILED'
    ACTIVE = 'ACTIVE'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of DeliveryStreamStatus from a JSON string"""
        return cls(json.loads(json_str))


