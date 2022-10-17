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


class ImscStylePassthrough(str, Enum):
    """
    Keep this setting enabled to have MediaConvert use the font style and position information from the captions source in the output. This option is available only when your input captions are IMSC, SMPTE-TT, or TTML. Disable this setting for simplified output captions.
    """

    """
    allowed enum values
    """
    ENABLED = 'ENABLED'
    DISABLED = 'DISABLED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of ImscStylePassthrough from a JSON string"""
        return cls(json.loads(json_str))


