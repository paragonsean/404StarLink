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


class XavcFlickerAdaptiveQuantization(str, Enum):
    """
    The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive quantization (XavcAdaptiveQuantization). When you do so, MediaConvert automatically applies the best types of quantization for your video content. Include this setting in your JSON job specification only when you choose to change the default value for Adaptive quantization. Enable this setting to have the encoder reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default. Related setting: In addition to enabling this setting, you must also set Adaptive quantization (adaptiveQuantization) to a value other than Off (OFF) or Auto (AUTO). Use Adaptive quantization to adjust the degree of smoothing that Flicker adaptive quantization provides.
    """

    """
    allowed enum values
    """
    DISABLED = 'DISABLED'
    ENABLED = 'ENABLED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of XavcFlickerAdaptiveQuantization from a JSON string"""
        return cls(json.loads(json_str))


