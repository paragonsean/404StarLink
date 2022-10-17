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


class XavcInterlaceMode(str, Enum):
    """
    Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
    """

    """
    allowed enum values
    """
    PROGRESSIVE = 'PROGRESSIVE'
    TOP_FIELD = 'TOP_FIELD'
    BOTTOM_FIELD = 'BOTTOM_FIELD'
    FOLLOW_TOP_FIELD = 'FOLLOW_TOP_FIELD'
    FOLLOW_BOTTOM_FIELD = 'FOLLOW_BOTTOM_FIELD'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of XavcInterlaceMode from a JSON string"""
        return cls(json.loads(json_str))


