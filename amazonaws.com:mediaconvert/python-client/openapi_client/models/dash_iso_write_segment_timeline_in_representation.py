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


class DashIsoWriteSegmentTimelineInRepresentation(str, Enum):
    """
    When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
    """

    """
    allowed enum values
    """
    ENABLED = 'ENABLED'
    DISABLED = 'DISABLED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of DashIsoWriteSegmentTimelineInRepresentation from a JSON string"""
        return cls(json.loads(json_str))


