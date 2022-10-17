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


class DvbddsHandling(str, Enum):
    """
    Specify how MediaConvert handles the display definition segment (DDS). To exclude the DDS from this set of captions: Keep the default, None. To include the DDS: Choose Specified. When you do, also specify the offset coordinates of the display window with DDS x-coordinate and DDS y-coordinate. To include the DDS, but not include display window data: Choose No display window. When you do, you can write position metadata to the page composition segment (PCS) with DDS x-coordinate and DDS y-coordinate. For video resolutions with a height of 576 pixels or less, MediaConvert doesn't include the DDS, regardless of the value you choose for DDS handling. All burn-in and DVB-Sub font settings must match.
    """

    """
    allowed enum values
    """
    NONE = 'NONE'
    SPECIFIED = 'SPECIFIED'
    NO_DISPLAY_WINDOW = 'NO_DISPLAY_WINDOW'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of DvbddsHandling from a JSON string"""
        return cls(json.loads(json_str))


