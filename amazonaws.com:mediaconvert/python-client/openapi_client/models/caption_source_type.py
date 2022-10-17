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


class CaptionSourceType(str, Enum):
    """
    Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect caption format.
    """

    """
    allowed enum values
    """
    ANCILLARY = 'ANCILLARY'
    DVB_SUB = 'DVB_SUB'
    EMBEDDED = 'EMBEDDED'
    SCTE20 = 'SCTE20'
    SCC = 'SCC'
    TTML = 'TTML'
    STL = 'STL'
    SRT = 'SRT'
    SMI = 'SMI'
    SMPTE_TT = 'SMPTE_TT'
    TELETEXT = 'TELETEXT'
    NULL_SOURCE = 'NULL_SOURCE'
    IMSC = 'IMSC'
    WEBVTT = 'WEBVTT'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of CaptionSourceType from a JSON string"""
        return cls(json.loads(json_str))


