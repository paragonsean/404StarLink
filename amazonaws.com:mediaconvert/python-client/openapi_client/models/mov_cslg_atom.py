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


class MovCslgAtom(str, Enum):
    """
    When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    """

    """
    allowed enum values
    """
    INCLUDE = 'INCLUDE'
    EXCLUDE = 'EXCLUDE'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of MovCslgAtom from a JSON string"""
        return cls(json.loads(json_str))


