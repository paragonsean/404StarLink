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


class Mp3RateControlMode(str, Enum):
    """
    Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate (VBR).
    """

    """
    allowed enum values
    """
    CBR = 'CBR'
    VBR = 'VBR'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Mp3RateControlMode from a JSON string"""
        return cls(json.loads(json_str))


