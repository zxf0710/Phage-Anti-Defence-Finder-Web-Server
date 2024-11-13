import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listPdetail(query) {
  return request({
    url: '/system/pdetail/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getPdetail(predictedDetailId) {
  return request({
    url: '/system/pdetail/' + predictedDetailId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addPdetail(data) {
  return request({
    url: '/system/pdetail',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updatePdetail(data) {
  return request({
    url: '/system/pdetail',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delPdetail(predictedDetailId) {
  return request({
    url: '/system/pdetail/' + predictedDetailId,
    method: 'delete'
  })
}

// 根据蛋白质ID查询
export function getPdetailByProteinIds(proteinIds) {
  return request({
    url: '/system/pdetail/' + proteinIds,
    method: 'post'
  })
}
