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


class Eac3BitstreamMode(str, Enum):
    """
    Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    """

    """
    allowed enum values
    """
    COMPLETE_MAIN = 'COMPLETE_MAIN'
    COMMENTARY = 'COMMENTARY'
    EMERGENCY = 'EMERGENCY'
    HEARING_IMPAIRED = 'HEARING_IMPAIRED'
    VISUALLY_IMPAIRED = 'VISUALLY_IMPAIRED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Eac3BitstreamMode from a JSON string"""
        return cls(json.loads(json_str))


