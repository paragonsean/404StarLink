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


class NoiseFilterPostTemporalSharpeningStrength(str, Enum):
    """
    Use Post temporal sharpening strength (postTemporalSharpeningStrength) to define the amount of sharpening the transcoder applies to your output. Set Post temporal sharpening strength to Low (LOW), Medium (MEDIUM), or High (HIGH) to indicate the amount of sharpening.
    """

    """
    allowed enum values
    """
    LOW = 'LOW'
    MEDIUM = 'MEDIUM'
    HIGH = 'HIGH'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of NoiseFilterPostTemporalSharpeningStrength from a JSON string"""
        return cls(json.loads(json_str))


