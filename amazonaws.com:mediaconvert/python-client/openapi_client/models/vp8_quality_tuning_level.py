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


class Vp8QualityTuningLevel(str, Enum):
    """
    Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, multi-pass encoding.
    """

    """
    allowed enum values
    """
    MULTI_PASS = 'MULTI_PASS'
    MULTI_PASS_HQ = 'MULTI_PASS_HQ'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Vp8QualityTuningLevel from a JSON string"""
        return cls(json.loads(json_str))


