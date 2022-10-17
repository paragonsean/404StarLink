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


class CmfcKlvMetadata(str, Enum):
    """
    To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough. MediaConvert reads KLV metadata present in your input and writes each instance to a separate event message box in the output, according to MISB ST1910.1. To exclude this KLV metadata: Set KLV metadata insertion to None or leave blank.
    """

    """
    allowed enum values
    """
    PASSTHROUGH = 'PASSTHROUGH'
    NONE = 'NONE'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of CmfcKlvMetadata from a JSON string"""
        return cls(json.loads(json_str))


