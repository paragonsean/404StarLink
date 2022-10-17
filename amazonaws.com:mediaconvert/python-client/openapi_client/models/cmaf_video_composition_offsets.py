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


class CmafVideoCompositionOffsets(str, Enum):
    """
    Specify the video sample composition time offset mode in the output fMP4 TRUN box. For wider player compatibility, set Video composition offsets to Unsigned or leave blank. The earliest presentation time may be greater than zero, and sample composition time offsets will increment using unsigned integers. For strict fMP4 video and audio timing, set Video composition offsets to Signed. The earliest presentation time will be equal to zero, and sample composition time offsets will increment using signed integers.
    """

    """
    allowed enum values
    """
    SIGNED = 'SIGNED'
    UNSIGNED = 'UNSIGNED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of CmafVideoCompositionOffsets from a JSON string"""
        return cls(json.loads(json_str))


