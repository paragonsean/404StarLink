# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class Eac3LfeFilter(str, Enum):
    """
    Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    """

    """
    allowed enum values
    """
    ENABLED = 'ENABLED'
    DISABLED = 'DISABLED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Eac3LfeFilter from a JSON string"""
        return cls(json.loads(json_str))


