# coding: utf-8

"""
    Twilio - Taskrouter

    This is the public Twilio REST API.

    The version of the OpenAPI document: 1.42.0
    Contact: support@twilio.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class TaskReservationEnumCallStatus(str, Enum):
    """
    TaskReservationEnumCallStatus
    """

    """
    allowed enum values
    """
    INITIATED = 'initiated'
    RINGING = 'ringing'
    ANSWERED = 'answered'
    COMPLETED = 'completed'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of TaskReservationEnumCallStatus from a JSON string"""
        return cls(json.loads(json_str))


