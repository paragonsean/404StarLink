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


class H265FlickerAdaptiveQuantization(str, Enum):
    """
    Enable this setting to have the encoder reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default. Related setting: In addition to enabling this setting, you must also set adaptiveQuantization to a value other than Off (OFF).
    """

    """
    allowed enum values
    """
    DISABLED = 'DISABLED'
    ENABLED = 'ENABLED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of H265FlickerAdaptiveQuantization from a JSON string"""
        return cls(json.loads(json_str))


