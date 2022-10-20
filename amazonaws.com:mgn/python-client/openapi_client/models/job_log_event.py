# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class JobLogEvent(str, Enum):
    """
    JobLogEvent
    """

    """
    allowed enum values
    """
    JOB_START = 'JOB_START'
    SERVER_SKIPPED = 'SERVER_SKIPPED'
    CLEANUP_START = 'CLEANUP_START'
    CLEANUP_END = 'CLEANUP_END'
    CLEANUP_FAIL = 'CLEANUP_FAIL'
    SNAPSHOT_START = 'SNAPSHOT_START'
    SNAPSHOT_END = 'SNAPSHOT_END'
    SNAPSHOT_FAIL = 'SNAPSHOT_FAIL'
    USING_PREVIOUS_SNAPSHOT = 'USING_PREVIOUS_SNAPSHOT'
    CONVERSION_START = 'CONVERSION_START'
    CONVERSION_END = 'CONVERSION_END'
    CONVERSION_FAIL = 'CONVERSION_FAIL'
    LAUNCH_START = 'LAUNCH_START'
    LAUNCH_FAILED = 'LAUNCH_FAILED'
    JOB_CANCEL = 'JOB_CANCEL'
    JOB_END = 'JOB_END'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of JobLogEvent from a JSON string"""
        return cls(json.loads(json_str))


