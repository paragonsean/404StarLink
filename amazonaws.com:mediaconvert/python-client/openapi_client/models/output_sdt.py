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


class OutputSdt(str, Enum):
    """
    Selects method of inserting SDT information into output stream. \"Follow input SDT\" copies SDT information from input stream to output stream. \"Follow input SDT if present\" copies SDT information from input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter \"SDT Manually\" means user will enter the SDT information. \"No SDT\" means output stream will not contain SDT information.
    """

    """
    allowed enum values
    """
    SDT_FOLLOW = 'SDT_FOLLOW'
    SDT_FOLLOW_IF_PRESENT = 'SDT_FOLLOW_IF_PRESENT'
    SDT_MANUAL = 'SDT_MANUAL'
    SDT_NONE = 'SDT_NONE'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of OutputSdt from a JSON string"""
        return cls(json.loads(json_str))


