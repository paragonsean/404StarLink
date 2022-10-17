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


class Vc3InterlaceMode(str, Enum):
    """
    Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will create a progressive output.
    """

    """
    allowed enum values
    """
    INTERLACED = 'INTERLACED'
    PROGRESSIVE = 'PROGRESSIVE'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Vc3InterlaceMode from a JSON string"""
        return cls(json.loads(json_str))


