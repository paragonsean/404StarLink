# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class Action(str, Enum):
    """
    Action
    """

    """
    allowed enum values
    """
    OPEN_APP = 'OPEN_APP'
    DEEP_LINK = 'DEEP_LINK'
    URL = 'URL'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Action from a JSON string"""
        return cls(json.loads(json_str))


