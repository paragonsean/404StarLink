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


class Alignment(str, Enum):
    """
    Alignment
    """

    """
    allowed enum values
    """
    LEFT = 'LEFT'
    CENTER = 'CENTER'
    RIGHT = 'RIGHT'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Alignment from a JSON string"""
        return cls(json.loads(json_str))


