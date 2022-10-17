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


class NielsenSourceWatermarkStatusType(str, Enum):
    """
    Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set this value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add non-linear watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
    """

    """
    allowed enum values
    """
    CLEAN = 'CLEAN'
    WATERMARKED = 'WATERMARKED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of NielsenSourceWatermarkStatusType from a JSON string"""
        return cls(json.loads(json_str))


