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


class AacCodingMode(str, Enum):
    """
    The Coding mode that you specify determines the number of audio channels and the audio channel layout metadata in your AAC output. Valid coding modes depend on the Rate control mode and Profile that you select. The following list shows the number of audio channels and channel layout for each coding mode. * 1.0 Audio Description (Receiver Mix): One channel, C. Includes audio description data from your stereo input. For more information see ETSI TS 101 154 Annex E. * 1.0 Mono: One channel, C. * 2.0 Stereo: Two channels, L, R. * 5.1 Surround: Five channels, C, L, R, Ls, Rs, LFE.
    """

    """
    allowed enum values
    """
    AD_RECEIVER_MIX = 'AD_RECEIVER_MIX'
    CODING_MODE_1_0 = 'CODING_MODE_1_0'
    CODING_MODE_1_1 = 'CODING_MODE_1_1'
    CODING_MODE_2_0 = 'CODING_MODE_2_0'
    CODING_MODE_5_1 = 'CODING_MODE_5_1'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of AacCodingMode from a JSON string"""
        return cls(json.loads(json_str))


