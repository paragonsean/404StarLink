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


class AacSpecification(str, Enum):
    """
    Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
    """

    """
    allowed enum values
    """
    MPEG2 = 'MPEG2'
    MPEG4 = 'MPEG4'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of AacSpecification from a JSON string"""
        return cls(json.loads(json_str))


