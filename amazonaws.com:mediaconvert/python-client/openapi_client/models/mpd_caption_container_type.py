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


class MpdCaptionContainerType(str, Enum):
    """
    Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
    """

    """
    allowed enum values
    """
    RAW = 'RAW'
    FRAGMENTED_MP4 = 'FRAGMENTED_MP4'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of MpdCaptionContainerType from a JSON string"""
        return cls(json.loads(json_str))


